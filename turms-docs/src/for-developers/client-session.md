# 会话的生命周期

Turms客户端的会话生命周期比较容易理解，具体而言：先通过`driver.connect(...)`进行网络层的连接，而后通过`userService.login(...)`进行业务层面上的登录操作，在登录成功后，对应的会话就建立了。最后再通过`userService.logout(...)`方法向服务端发送会话关闭通知，同时也会关闭网络层连接。

为了保持逻辑简单，也方便上层开发者自行组合各种逻辑。Turms不提供诸如自动重连、自动路由跳转等操作，一方面开发者可以很容易地实现该类逻辑，另一方面，这类“隐藏”的内部逻辑会使得上层开发者难以把控底层驱动行为，在一些时候反而会成为绊脚石。

拓展：如同WebSocket基于关闭帧的会话关闭机制，Turms服务端在关闭会话时，也会通过一个会话关闭信令来通知客户端该会话已关闭，并在信令被Flushed后，通知底层WebSocket/TCP关闭连接。Turms服务端不需要等待客户端对会话关闭信令的任何响应，客户端也不会向服务端发送有关会话关闭信令的响应。

## 生命周期回调钩子

| 层次       | 名称                             | 调用时机              | 提醒                                                         |
| ---------- | -------------------------------- | --------------------- | ------------------------------------------------------------ |
| 网络层     | driver.addOnConnectedListener    | 当网络层连接建立时    | 通常您并不需要通过`addOnConnectedListener`来添加连接监听事件，<br />而是将您的回调函数赋给`driver.connect(...)`返回的异步成功回调onSucccess/then |
| 网络层     | driver.addOnDisconnectedListener | 当网络层连接断开时    |                                                              |
| 业务逻辑层 | userService.addOnOnlineListener  | 当会话建立/用户上线时 | 通常您并不需要通过`addOnOnlineListener`来添加上线监听事件，<br />而是将您的回调函数赋给`userService.login(...)`返回的异步成功回调onSucccess/then |
| 业务逻辑层 | userService.addOnOfflineListener | 当会话断开/用户下线时 |                                                              |
