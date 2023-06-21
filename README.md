# this project is trying to run sveltekit as anwebui application.
## the web application is working in production mode:
```shell script
./mvnw compile quarkus:dev
```
then
```shell script
java -jar target/quarkus-app/quarkus-run.jar
```
then go to http://localhost:8080 
click on SVPOSTS (that call quarkus GreetingResource) will display:
```
Hello 123from RESTEasy Reactive
```
This is GOOD!

*BUT* it is not working in dev mode:

### with dev server true and index-page /:
quarkus.quinoa.dev-server=true
%dev.quarkus.quinoa.index-page=/

the error is :
```
Error: Not found: //
at resolve (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:430:13)
```
and I am redirected to default quarkus index.html
### ### with dev server true and index-page default:
quarkus.quinoa.dev-server=true
%dev.quarkus.quinoa.index-page=/

```
Error: Not found: /index.html                                                                                                                                                                                                       
    at resolve (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:430:13)
    at resolve (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:277:5)                                                                                           
    at #options.hooks.handle (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/index.js:49:56)                                                                               
    at Module.respond (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:274:40)                                                                                   
    at process.processTicksAndRejections (node:internal/process/task_queues:95:5)                                                                                                                                                   
Error: Not found: /favicon.ico                                                                                                                                                                                                      
    at resolve (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:430:13)
    at resolve (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:277:5)                                                                                           
    at #options.hooks.handle (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/index.js:49:56)                                                                               
    at Module.respond (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:274:40)                                                                                   
    at process.processTicksAndRejections (node:internal/process/task_queues:95:5)                                                                                                                                                   
Error: Not found: /index.html                                                                                                                                                                                                       
    at resolve (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:430:13)                                                                                          
    at resolve (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:277:5)                                                                                           
    at #options.hooks.handle (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/index.js:49:56)                                                                               
    at Module.respond (C:/DEV/snipets/sveltekit-quark/230621-svk3/src/main/webui/node_modules/@sveltejs/kit/src/runtime/server/respond.js:274:40)                                                                                   
    at process.processTicksAndRejections (node:internal/process/task_queues:95:5)                                                                                                                                                   
```

### with quarkus.quinoa.dev-server=false

The problem is that sveltekit is precompiling stuff in the webui/sveltekit folder, so eachtime quarkus ask for a compilation, the live reload is trigered and re ask for a compilation.
At the end of the day compilation never ending.



