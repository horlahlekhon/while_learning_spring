# CDI (container dependency injection)
Created Friday 08 February 2019

CDI is an interface for dependency injection, so any library that wants to use the DI in java will impolement the CDI and thus the Spring DI does.
the CDI provides annotations that can be used to inject dependencies just the way spring does. 
@Inject : this does the implementation of this annotation by spring s what produced @Autowired
@Named : this produced ( @Component & @Qualifier ) that enables us to do autowiring by type and by name respectively
@Singleton : this helps to define the scope of a singleton
we can subtitude any of the spring annotations relating to DI with the CDI version, i.e @Inject can be used where @Autowired is required 

the CDI is [Java EE](./Java_EE.markdown) standard and can be used in place of the dependecny injection in spring, it is used in play framework also.  



