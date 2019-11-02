## 一、微服务概述

### 		1、什么是微服务

​		但通常而言， 微服务架构是一种架构模式或者说是一种架构风格， 它提倡将单一应用程序划分成一组小的服务 ，每个服务运行在其独立的自己的 进程中 ，服务之间互相协调、互相配合，为用户提供最终价值。服务之间采用轻量级的通信机制互相沟通（通常是基于HTTP的RESTful API）。每个服务都围绕着具体业务进行构建，并且能够被独立地部署到生产环境、类生产环境等。另外，应尽量避免统一的、集中式的服务管理机制，对具体的一个服务而言，应根据业务上下文，选择合适的语言、工具对其进行构建，可以有一个非常轻量级的集中式管理来协调这些服务，可以使用不同的语言来编写服务，也可以使用不同的数据存储。
​		微服务化的核心就是将传统的一站式应用，根据业务拆分成一个一个的服务，彻底地去耦合,每一个微服务提供单个业务功能的服务，一个服务做一件事，从技术角度看就是一种小而独立的处理过程，类似进程概念，能够自行单独启动或销毁，拥有自己独立的数据库。

###			2、微服务与微服务架构

​		微服务架构是⼀种架构模式，它提倡将单⼀应⽤程序划分成⼀组⼩的服务，服务之间互相协调、互相配合，为⽤户提供最终价值。每个服务运⾏在其 独⽴的进程中，服务与服务间采⽤轻量级的通信机制互相协作（通常是基于HTTP协议的RESTful API）。每个服务都围绕着具体业务进⾏构建，并且能够被独⽴的部署到⽣产环境、类⽣产环境等。另外，应当尽量避免统⼀的、集中式的服务管理机制，对具体的⼀个服务⽽⾔，应根据业务上下⽂，选择合适的语⾔、⼯具对其进⾏构建。 

### 	3、微服务优缺点

#### 		3.1 优点

​			每个服务足够内聚，足够小，代码容易理解这样能聚焦一个指定的业务功能或业务需求 开发简单、开发效率提高，一个服务可能就是专一的只干一件事。微服务能够被小团队单独开发，这个小团队是2到5人的开发人员组成。微服务是松耦合的，是有功能意义的服务，无论是在开发阶段或部署阶段都是独立的。微服务能使用不同的语言开发。易于和第三方集成，微服务允许容易且灵活的方式集成自动部署，通过持续集成工具，如Jenkins, Hudson, bamboo 。微服务易于被一个开发人员理解，修改和维护，这样小团队能够更关注自己的工作成果。无需通过合作才能体现价值。微服务允许你利用融合最新技术。微服务只是业务逻辑的代码，不会和HTML,CSS 或其他界面组件混合。每个微服务都有自己的存储能力，可以有自己的数据库。也可以有统一数据库。

#### 		3.2 缺点

​			开发人员要处理分布式系统的复杂性、多服务运维难度，随着服务的增加，运维的压力也在增大、系统部署依赖、服务间通信成本、数据一致性、系统集成测试、性能监控……

### 	4、微服务技术栈有哪些

| 微服务条目                             | 落地技术                                                     |
| -------------------------------------- | ------------------------------------------------------------ |
| 服务开发                               | Springboot、Spring、SpringMVC                                |
| 服务配置与管理                         | Netflix公司的Archaius、阿里的Diamond等                       |
| 服务注册与发现                         | Eureka、Consul、Zookeeper等                                  |
| 服务调用                               | Rest、RPC、gRPC                                              |
| 服务熔断器                             | Hystrix、Envoy等                                             |
| 负载均衡                               | Ribbon、Nginx等                                              |
| 服务接口调用(客户端调用服务的简化工具) | Feign等                                                      |
| 消息队列                               | Kafka、RabbitMQ、ActiveMQ等                                  |
| 服务配置中心管理                       | SpringCloudConfig、Chef等                                    |
| 服务路由（API网关）                    | Zuul等                                                       |
| 服务监控                               | Zabbix、Nagios、Metrics、Spectator等                         |
| 全链路追踪                             | Zipkin，Brave、Dapper等                                      |
| 服务部署                               | Docker、OpenStack、Kubernetes等                              |
| 数据流操作开发包                       | SpringCloud Stream（封装与Redis,Rabbit、Kafka等发送接收消息） |
| 事件消息总线                           | Spring Cloud Bus                                             |
| ......                                 |                                                              |

### 	5、为什么选择SpringCloud作为微服务架构

#### 		5.1 当前各大IT公司用的微服务架构有哪些?

​				阿里Dubbo/HSF、京东JSF、新浪微博Motan、当当网DubboX等。

#### 		5.2 各微服务框架对比


​      ￼									<img src="/store/thumbs/2019/1102/02001456hk8u.png" alt="image-20191101234723869" style="zoom: 50%;" />

##  

## 二、SpringCloud入门概述

### 	1、是什么 

 ￼￼￼ 											￼￼<img src="/store/thumbs/2019/1102/02001656zxrt.png" alt="image-20191101235221606" style="zoom:33%;" />    

​		SpringCloud，基于SpringBoot提供了一套微服务解决方案，包括服务注册与发现，配置中心，全链路监控，服务网关，负载均衡，熔断器等组件，除了基于NetFlix的开源组件做高度抽象封装之外，还有一些选型中立的开源组件。 		                  	    SpringCloud利用SpringBoot的开发便利性巧妙地简化了分布式系统基础设施的开发，SpringCloud为开发人员提供了快速构建分布式系统的一些工具， 包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等 ,它们都可以用SpringBoot的开发风格做到一键启动和部署。
​		SpringBoot并没有重复制造轮子，它只是将目前各家公司开发的比较成熟、经得起实际考验的服务框架组合起来，通过SpringBoot风格进行再封装屏蔽掉了复杂的配置和实现原理， 最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工具包。
​		SpringCloud是分布式微服务架构下的一站式解决方案，是各个微服务架构落地技术的集合体，俗称微服务全家桶。

#### 		1.1 SpringCloud和SpringBoot是什么关系

​		SpringBoot专注于快速方便的开发单个个体微服务。SpringCloud是关注全局的微服务协调整理治理框架，它将SpringBoot开发的一个个单体微服务整合并管理起来，为各个微服务之间提供，配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等集成服务。SpringBoot可以离开SpringCloud独立使用开发项目， 但是SpringCloud离不开SpringBoot ，属于依赖的关系。SpringBoot专注于快速、方便的开发单个微服务个体，SpringCloud关注全局的服务治理框架。 

#### 		1.2 我们把SpringCloud VS DUBBO进行一番对比  

<img src="/store/thumbs/2019/1102/02001818c00c.png" alt="image-20191101235714500" style="zoom:50%;" />

​		**最大区别**：SpringCloud抛弃了Dubbo的RPC通信，采用的是基于HTTP的REST方式。严格来说，这两种方式各有优劣。虽然从一定程度上来说，后者牺牲了服务调用的性能，但也避免了上面提到的原生RPC带来的问题。而且REST相比RPC更为灵活，服务提供方和调用方的依赖只依靠一纸契约，不存在代码级别的强依赖，这在强调快速演化的微服务环境下，显得更加合适。 

​		**品牌机与组装机的区别**：很明显，Spring Cloud的功能比DUBBO更加强大，涵盖面更广，而且作为Spring的拳头项目，它也能够与Spring Framework、Spring Boot、Spring Data、Spring Batch等其他Spring项目完美融合，这些对于微服务而言是至关重要的。使用Dubbo构建的微服务架构就像组装电脑，各环节我们的选择自由度很高，但是最终结果很有可能因为一条内存质量不行就点不亮了，总是让人不怎么放心，但是如果你是一名高手，那这些都不是问题；而Spring Cloud就像品牌机，在Spring Source的整合下，做了大量的兼容性测试，保证了机器拥有更高的稳定性，但是如果要在使用非原装组件外的东西，就需要对其基础有足够的了解。 

​		**社区支持与更新力度**：最为重要的是，DUBBO停止了5年左右的更新，虽然2017.7重启了。对于技术发展的新需求，需要由开发者自行拓展升级（比如当当网弄出了DubboX），这对于很多想要采用微服务架构的中小软件组织，显然是不太合适的，中小公司没有这么强大的技术能力去修改Dubbo源码+周边的一整套解决方案，并不是每一个公司都有阿里的大牛+真实的线上生产环境测试过。 

### 	2、能干嘛

​		Distributed/versioned configuration(分布式/版本控制配置)、Service registration and discovery(服务注册与发现)、
Routing(路由)、Service-to-service calls(服务到服务的调用)、Load balancing(负载均衡配置)、Circuit Breakers(断路器)、Distributed messaging(分布式消息管理)等等。

### 	3、官网及文档

​		[官网](https://spring.io/projects/spring-cloud)、[参考书](https://www.springcloud.cc/spring-cloud-netflix.html)、[开发API说明](https://www.springcloud.cc/spring-cloud-dalston.html)、[springcloud中国社区](http://springcloud.cn/)、[springcloud中文网](https://www.springcloud.cc/)

### 	4、主要组件

​		服务的注册与发现（Eureka）、服务消费者（rest+Ribbon）、服务消费者（Feign）、断路器（Hystrix）、断路器监控(Hystrix Dashboard)、路由网关(Zuul)、分布式配置中心(Spring Cloud Config)、消息总线(Spring Cloud Bus)、服务链路追踪(Spring Cloud Sleuth)
