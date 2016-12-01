/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.generator.config.rules;

/**
 * ID生成策略
 *
 * @author YangHu
 * @since 2016/8/30
 */
public enum IdStrategy {
	auto("AUTO"), id_worker("ID_WORKER"), uuid("UUID"), input("INPUT");

	private String value;

	IdStrategy(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
