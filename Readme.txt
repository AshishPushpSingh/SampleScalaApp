After cloning the git repository go inside the play-scala-starter-example according to your directory structure.

Goto the sbt interactive screen using following command.
./sbt-dist/bin/sbt "$@"

Run the project using "run" command:
[play-scala-starter-example] $ run

You can also use following commands:
clean
update
reload
compile


Once the application starts you'll see the following msg: -

--- (Running the application, auto-reloading is enabled) ---

[info] p.c.s.AkkaHttpServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000

(Server started, use Enter to stop and go back to the console...)


The Application will start by default on port : 9000


The Endpoints in this application are :-

1.   http://localhost:9000/getdata
2.   http://localhost:9000/getdata1

Both the endpoints are GET requests and will return JSON as response.


