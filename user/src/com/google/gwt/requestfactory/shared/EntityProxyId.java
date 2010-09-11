/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.requestfactory.shared;

/**
 * A stable, opaque id of an {@link EntityProxy} that remains stable across
 * updates, creates, deletes on the client.
 * <p>
 * In particular, an {@link EntityProxy} foo that is yet to be persisted and a
 * copy of foo after being persisted have equal {@link EntityProxyId}.
 */
public interface EntityProxyId {
  /**
   * Returns a stable string that remains the same across updates and creates on
   * the client. Note that calling this method on an instance that has not been
   * persisted throws IllegalStateException.
   * 
   * @return a stable string that remains the same across updates and creates on
   *         the client.
   */
  String asString();
}