/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.google.wave.splash;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 */
public class JettyRun {
  private final Server server = new Server(8080);

  public JettyRun() {
    server.addHandler(new WebAppContext("war", ""));
  }

  public static void main(String...args) throws Exception {
    JettyRun jettyRun = new JettyRun();

    jettyRun.server.start();
    jettyRun.server.join();
  }
}
