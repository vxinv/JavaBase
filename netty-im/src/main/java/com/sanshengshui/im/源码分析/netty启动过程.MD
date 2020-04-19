01 源码需要剖析道 doBind方法
 
 
 
02
 一个EventLoopGroup当中包含一个或者多个EventLoop
 一个EventLoop在他的生命周期中只会一个Thread绑定
 所有EventLoop处理的各种IO事件都有关联的Thread处理
 一个channel在其生命周期只会于一个Eventloop关联
 一个EventLoop 在运行当中 会被分配个多个channel
 
 
03
    默认情况下 channelhanler 的回调方法都是在IO线程执行的 可以在传递是添加线程组
    netty 对ChannelFuture 进行了增强  但是ChannelFutureComplate 实在IO线程中执行的
    
    
   
   