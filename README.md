# Command and Query Responsibility Segregation (CQRS)

Command Query Responsibility Segregation's  goal is to segregate the responsibilities for executing command and queries. A Command is a method that performs an action. These would be the Create, Update and Delete parts of a CRUD system. A Query is a method that returns data to the caller without modifying the records stored. This is the Read part of a CRUD system.


## Event Sourcing and CQRS

Some implementations of CQRS use the Event Sourcing pattern. Using this pattern, the application state is stored as a sequence of events. Each event represents a set of changes to the data. The current state is constructed by replaying the events. Using the stream of events as the write store, rather than the actual data at a point in time, avoids update conflicts on a single aggregate and maximizes performance and scalability. Commands may be placed on a queue for asynchronous processing, rather than being processed synchronously. When we separate the read and write databases, the read data may be stale (eventual consistency). Rather than microservices being told what to do explicitly, they subscribe to some event source and react to events as they happen.

[Axon](https://axoniq.io/) is a CQRS/Event Sourcing framework uses message-based commands, events, and queries.
* Command - represents the intent to perform an action.
* Event - represents a notification that something (important) has happened.
* Query - represents a request for information.

This example demonstrates subscription queries in the Axon Framework developed and presented by [Frans van Buul](https://www.youtube.com/watch?v=b3NLDxa6MWE). I made minor update to the `POM` file to add the JAX-B APIs dependencies.

## How to run
```
$ git clone https://github.com/amirghaffari/axon_subscription_queries.git
$ cd axon_subscription_queries
$ mvn spring-boot:run
```
Visit: http://localhost:8080/
