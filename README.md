### **常用的一些设计模式**

src目录下为源代码，每一个设计模式的例子都放在一个package中。

- StrategePattern
	在本package下有一个策略模式的例子

> **策略模式**: 定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。

- ObserverPattern
	在本package下有一个观察者模式的例子
	usejdk包中的代码为利用jdk提供的观察者模式类与接口实现

> **观察者模式**： 观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

- DesignPatterns
	本package下有一个装饰者模式的例子。

> **策略模式**：动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。

- FactoryPatterns
	本package下有一个工厂模式的例子，分为简单工厂、工厂方法、抽象工厂。

> **工厂方法**：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
> **抽象工厂**：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。