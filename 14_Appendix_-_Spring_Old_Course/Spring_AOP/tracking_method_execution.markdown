# tracking method execution
Created Thursday 14 February 2019

//what kind of method will we like to intercept
//how does one intercept a method
// the syntax for defining the method that we want to intercept is kinda weird
// ``execution(* PACKAGE.*.*(...))`` 
//what this translates into is that the first "*" means that 'any return type' meaning that we want to intercept this method for any return type
//"PACKAGE" means that in a specific package, this would be replaced by the package that we wanty to 'componentScan'
//the zecond "*" means that in 'any class' as far as it is in that package 
//the third "*" means that we want to intercept every method calls to this method,
//the elipses (..) means that for any amount of args , or irrespective of arguments taken by the method.

//this @Before annot. intercept method calls before they are invoked.
//this is good when one want to check for authorization, so one can just check if the user has access to tyhe
//method call before granting him an access to invoke it. the advantage of implementing user acces check
//using AOP id that aop CHECKS span the entirety of the Business layer so we wont need to run the check again
//whenever we want to grant access.
``@Before("execution(* com.sisyphus.springaop.springaop.business.*.*(..))")``
``    public void before(JoinPoint joinPoint) {``
``        logger.info("Check for user accesss");``
``        logger.info("Allow execution access for - {}", joinPoint);``
``    }``


##### terminologies of AOP:
@PointCut: 
point cut is the names used to refer to the structred way to which the method to be intercepted are represented syntactically , basically this " ``execution(* PACKAGE.*.*(...))`` " construct.
@Advice: 
Advice are the logic that are implemented to deal and work with the intercepted methods. in our above example it will be the Loggings , and we can write any logic like user access protocols e.t.c there. this is called an AOP Advice.
@Aspect:
an aspect is the combination of the pointcut and the advice. basically telling us that an aspect is the combination of "what methods to intercept" and "what to do with the intercepted methods"
this is called an aspect.
@JointPoints:
this is a specific instance of a single interception. this interface stores the data collected when the method is intercepted. so if a method is called a hundred times, we shall have a hundred JointPoints. the object provides specific data about the method that is called at that instantiation. like the args that the method takes. and more
@Weaving:
the process of ensuring that the method is called and analysed is called weaving. it can also be seen as the implementation of the AOP method interception on our method.
@Weaver: 
Weavers are the process that wraps around each method to implement waeving


