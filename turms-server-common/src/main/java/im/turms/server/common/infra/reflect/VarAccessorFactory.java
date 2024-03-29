/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
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

package im.turms.server.common.infra.reflect;

import lombok.SneakyThrows;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Field;

/**
 * @author James Chen
 */
public final class VarAccessorFactory {

    private VarAccessorFactory() {
    }

    public static <T, V> VarAccessor<T, V> get(Field field) {
        if (field.getType().isPrimitive() || field.getDeclaringClass().isRecord()) {
            return new FieldBasedVarAccessor<>(field);
        }
        return new UnsafeBasedVarAccessor<>(field);
    }

    public static <T, V> VarAccessor<T, V> get(Field fieldForGetter, MethodHandle setter) {
        if (fieldForGetter.getType().isPrimitive() ||
                fieldForGetter.getDeclaringClass().isRecord()) {
            return new FieldAndMethodHandledBasedVarAccessor<>(fieldForGetter, setter);
        }
        return new UnsafeAndMethodHandledBasedVarAccessor<>(fieldForGetter, setter);
    }

    @SneakyThrows
    public static <T, V> VarAccessor<T, V> get(Class<T> clazz, String fieldName) {
        return get(clazz.getDeclaredField(fieldName));
    }
}
