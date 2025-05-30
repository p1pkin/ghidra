/* ###
 * IP: GHIDRA
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
 */
package ghidra.program.model.lang;

import ghidra.util.exception.UsrException;

/**
 * <p>An UnknownDataException indicates that the bytes at the parse
 * address did not form a legal known data item.</p>
 *
 * @version 2000-02-15
 */
public class UnknownDataException extends UsrException {
	/**
	 * <p>Constructs an UnknownDataException with a default message.
	 */
	public UnknownDataException() {
		super("Bytes do not form a legal data item.");
	}

	/**
	 * <p>Constructs an UnknownDataException with the specified
	 * detail message.
	 *
	 * @param message The message.
	 */
	public UnknownDataException(String message) {
		super(message);
	}
}
