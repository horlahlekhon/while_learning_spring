# Bean Life cirlce
Created Thursday 07 February 2019

This involves the management and manipulation of the bean during its lifecircle. like if we want to do something to a autowired bean at the creation of the object; this sounds weird, because the bean is autoeired automatically, but there are ways we can modify of do something to the bean at any point in time in its life circle.

@PostConstruct:
lets assume we want to do something before a bean is created , like check if all its dependencies are populated , we can use the @PostConstruct, annotation on a method that will perform the action and 
	
example :
	@PostConstruct
	    public void postConstruct(){
	        LOGGER.info("post construct")
	
	    }

@PreDestroy:
this can be used to do clean up or anything just befoe destruction on the bean



