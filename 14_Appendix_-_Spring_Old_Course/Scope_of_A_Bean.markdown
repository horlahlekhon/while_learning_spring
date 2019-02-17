# Scope of A Bean
Created Thursday 07 February 2019

Beans are POJO that are singletons which object can only be created once per [ApplicationContext](./ApplicationContext.markdown)

Scopes:

* Singleton - one Bean per Spring Context
* Prototype -  new beans is created whenever requested
* request - one bean per HTTP request
* session - one bean per HTTP session



[Singleton](./Singleton.markdown) Beans :
the singleton bean are the bean that are o nly created once, and even if you create another instance of the class it will always point to the first created bean.
wwhat this tells us is that all beans that the IOC or [ApplicationContext](./ApplicationContext.markdown) of spring manage's are singleton, they are created once and buffered to memory where they can always be injected into any other beans that require them. this settings of singleton apply to the scope of Spring Application COntext, there are other scope in spring which behaviour of the beans they manages are different.
	
[ProtoType](./ProtoType.markdown) Beans:
when in the prototype scope, new beans are created everytime they are requested, this is not the default behaviour. to change the scope of a Bean to prototype from the default singleton; we use the ``@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE), `` this will make the instance of the bean be created everytime new instance is created, or requested for injection

Request:
when in the scope of a request, the beans managed are created per request so, one bean per request. after every request has been responded to, the	 beans used are destroyed snd new ones are created if another request is recieved.
	
session Beans:
in the scope of a session, the beans managed in the user session are only retained for that user session and when the session is ended , theya are destroyed 


