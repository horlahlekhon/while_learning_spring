# Autowiring
Created Thursday 07 February 2019

[AutoWiring](#14 Appendix - Spring Old Course:Autowiring) is the concept on dependency injection where dependencies are auto created for the component or beans class , example if a class takes another class as a dependency, that the class that is the dependency can be auto wired into the one that need the dependency, this way we wouldnt need to create an instance of the dependency class to use it in our class. i.e

  ``public interface SortAlgorith{}``

	class QuickSort implements SortAlgorithm {}
	
	@Component
	@Primary
	class BubbleSortAlgorith implements SortAlgorithm {}


	@Component
	class BinarySearchImpl{
	
	@Autowired
	private SortAlgorithm sortAlg;
	
	}

the [SortAlgorithm](./SortAlgorithm.markdown) object is a dependency of the [BinarySearchImpl](./BinarySearchImpl.markdown) class so putting the ``@Autowired `` annotation on it make it injected inot the class automatically.

##### Autowiring by type
if the dependency is an interface , then one of its implementations that is annotated with ``@Primary``  will be used . if the @Primary annotation isnt in any of its implementations then there will be an error. this is Autowiring by type since we are judging wchich impl to use based on their types.

``@Qualifier("name"):``
we can also use this annotation to make a class qualify for DI , by annotating the Component class as @Qualifier("name"), we give it a name, and in the implementation we just , put a  @Qualifier annotation on the dependency too and assign it the name yiu gave the bean COmponent


##### Autowiring by name:
we can also do autowiring by name , in the case where we dont want to assign implementation of the interface @Primary annotation, we can do this by passing the name of the implementation we want to use as the name of the object variable declaration in our Component class that is dependent. i.e

	@Component
	class BinarySearchImpl{
	
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;
	
	}
	
	
doing the above will allow the bubbleSortAlgorith implementation of [SortAlgorithm](./SortAlgorithm.markdown) to be favoured

