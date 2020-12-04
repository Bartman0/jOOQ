/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.Names.N_ASC;
import static org.jooq.impl.Names.N_ASCII;
import static org.jooq.impl.Names.N_ASCII_VAL;
import static org.jooq.impl.SQLDataType.INTEGER;
import static org.jooq.impl.SQLDataType.VARCHAR;
import static org.jooq.impl.Tools.nullSafeNotNull;

import org.jooq.Context;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
final class Ascii extends AbstractField<Integer> {

    /**
     * Generated UID
     */
    private static final long             serialVersionUID = -7273879239726265322L;

    private final Field<?>                string;

    Ascii(Field<?> string) {
        super(N_ASCII, INTEGER.nullable(string == null || string.getDataType().nullable()));

        this.string = nullSafeNotNull(string, VARCHAR);
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {






            case FIREBIRD:
                ctx.visit(N_ASCII_VAL).sql('(').visit(string).sql(')');
                break;

            // TODO [#862] [#864] emulate this for some dialects



            case DERBY:
            case SQLITE:
            default:
                ctx.visit(N_ASCII).sql('(').visit(string).sql(')');
                break;
        }
    }
}
