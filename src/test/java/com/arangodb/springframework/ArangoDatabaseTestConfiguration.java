/*
 * DISCLAIMER
 *
 * Copyright 2016 ArangoDB GmbH, Cologne, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.springframework;

import org.springframework.context.annotation.Configuration;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.core.config.AbstractArangoDatabaseConfiguration;

/**
 * @author Mark - mark at arangodb.com
 *
 */
@Configuration
public class ArangoDatabaseTestConfiguration extends AbstractArangoDatabaseConfiguration {

	@Override
	public ArangoDB.Builder arango() {
		return new ArangoDB.Builder();
	}

	@Override
	public String database() {
		return "_system";
	}

}
