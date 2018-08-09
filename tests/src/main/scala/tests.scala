/* Mercator, version 0.1.0. Copyright 2018 Jon Pretty, Propensive Ltd.
 *
 * The primary distribution site is: http://propensive.com/
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package mercator.tests

import estrapade._
import mercator._

object Tests extends TestApp {
  def tests(): Unit = {
    monadicEvidence[Option]
    monadicEvidence[({ type L[W] = Either[String, W] })#L]

    ()
  }
}