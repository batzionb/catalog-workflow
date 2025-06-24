# OrderManagement with Serverless Workflow

## Workflow entry points

Launch the process:

```sh
curl -X POST -H 'Content-Type:application/json' -H 'Accept:application/json' -d '{ "workflowdata": { "orderId": "order-123"} }' http://localhost:8080/order
```

Send a Cloud Event:

```sh
curl -X POST -H "Content-Type: application/json" -H "ce-specversion: 1.0" -H "ce-source: commerce" -H "ce-type: OrderEventType" -H "ce-id: f0643c68-609c-48aa-a820-5df423fa4fe0" -d '{"orderId": "order-123"}' http://localhost:8080
```

Run
mvn quarkus:dev