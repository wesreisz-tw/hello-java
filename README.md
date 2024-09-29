#Running Functions
Simple hello world target for function
code.

reference:
* https://cloud.google.com/functions/docs/create-deploy-http-java

### run locally
`mvn function:run -Drun.functionTarget=functions.HelloWorld`

### deploy to gCloud
`export REGION=us-east2`
`gcloud functions deploy hello-java-function \
--gen2 \
--entry-point=functions.HelloWorld \
--runtime=java17 \
--region=$REGION \
--source=. \
--trigger-http \
--allow-unauthenticated`
