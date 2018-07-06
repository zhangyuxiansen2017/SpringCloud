package cn.myrule;

import java.util.List;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * 算法需求，每个服务轮询5次
 * 
 * @author 章鱼先森
 *
 * @date 2018年7月5日
 */
public class RandomRule_ZGM extends AbstractLoadBalancerRule {
	int total = 0; // 轮询的次数
	int index = 0; // 第几个服务下表

	public Server choose(ILoadBalancer lb, Object key) {
		if (lb == null) {
			return null;
		}
		Server server = null;

		while (server == null) {

			// Thread.interrupted()当钱线程是否中断
			if (Thread.interrupted()) {
				return null;
			}
			List<Server> allList = lb.getAllServers();
			List<Server> upList = lb.getReachableServers();
			int serverCount = allList.size();
			if (serverCount == 0) {
				return null;
			}

			if (total < 5) {
				server = upList.get(index);
				total++;
			} else {
				total = 0;
				index++;
				if (index >= serverCount) {
					index = 0;
				}
			}

			if (server == null) {
				Thread.yield();
				continue;
			}
			if (server.isAlive()) {
				return (server);
			}
			server = null;
			Thread.yield();
		}

		return server;

	}

	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub

	}
}
