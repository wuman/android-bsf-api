ANDROID-BSF-API
===============

Android-bsf-api is a port/fork of the Apache Commons Bean Scripting Framework
API for the Android platform. It includes the `javax.script.*` classes.

In addition to the bsf-api port, android-bsf-api also includes a modified
implementation of the `sun.misc.Service` and the `javax.imageio.spi.ServiceRegistry`
classes. These implementations look for service provider declarations in the
`ANDROID-META-INF/services/` folder rather than the `META-INF/services` folder, 
which is normally stripped away by the Android `dex` packager.

More information about the original bsf-api can be found at the 
[official BSF site](http://commons.apache.org/bsf/).


Including in Your Project
-------------------------

There are two ways to include the library in your projects:

1. You can download the released jar file in the [Downloads section](https://github.com/wuman/android-bsf-api/downloads).
2. If you use Maven to build your project you can simply add a dependency to 
   the desired component of the library.

        <dependency>
            <groupId>com.wu-man</groupId>
            <artifactId>android-bsf-api</artifactId>
            <version>3.1.2</version>
        </dependency>


Contribute
----------

If you would like to contribute code you can do so through GitHub by forking 
the repository and sending a pull request.


License
-------

    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.    

