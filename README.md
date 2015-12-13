Spring Data REST demo project
=============================

Simple Spring Data REST demo project

Requisites
----------

MongoDB

    $ brew install mongodb
    $ mongod --config /usr/local/etc/mongod.conf

Rest-Shell

    $ brew install rest-shell

Building
--------

Enter `db` folder and import some test data:

    $ cd db
    $ ./import-test-data.sh

Build project:

    $ ./gradlew build

Running
-------

From Gradle:

    $ ./gradlew bootRun

From generated JAR executable:

    $ cd build/libs
    $ ./spring-data-rest.jar

Testing
-------

    $ rest-shell
    http://localhost:8080:> follow invoices
    http://localhost:8080:> list
    http://localhost:8080:> get
