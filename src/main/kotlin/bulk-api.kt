/*
 * Copyright (c) 2014-2015 Mark Platvoet<mplatvoet@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package nl.mplatvoet.komponents.kovenant

public fun all<V, E>(vararg promises: Promise<V, E>): Promise<List<V>, E> = concreteAll(*promises)


public data class Tuple2
<V1, V2>
(val value1 : V1,
 val value2 : V2)

public data class Tuple3
<V1, V2, V3>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3)

public data class Tuple4
<V1, V2, V3, V4>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4)

public data class Tuple5
<V1, V2, V3, V4, V5>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5)

public data class Tuple6
<V1, V2, V3, V4, V5, V6>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6)

public data class Tuple7
<V1, V2, V3, V4, V5, V6, V7>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7)

public data class Tuple8
<V1, V2, V3, V4, V5, V6, V7, V8>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8)

public data class Tuple9
<V1, V2, V3, V4, V5, V6, V7, V8, V9>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9)

public data class Tuple10
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10)

public data class Tuple11
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11)

public data class Tuple12
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12)

public data class Tuple13
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13)

public data class Tuple14
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13,
 val value14 : V14)

public data class Tuple15
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13,
 val value14 : V14,
 val value15 : V15)

public data class Tuple16
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13,
 val value14 : V14,
 val value15 : V15,
 val value16 : V16)

public data class Tuple17
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13,
 val value14 : V14,
 val value15 : V15,
 val value16 : V16,
 val value17 : V17)

public data class Tuple18
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13,
 val value14 : V14,
 val value15 : V15,
 val value16 : V16,
 val value17 : V17,
 val value18 : V18)

public data class Tuple19
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13,
 val value14 : V14,
 val value15 : V15,
 val value16 : V16,
 val value17 : V17,
 val value18 : V18,
 val value19 : V19)

public data class Tuple20
<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20>
(val value1 : V1,
 val value2 : V2,
 val value3 : V3,
 val value4 : V4,
 val value5 : V5,
 val value6 : V6,
 val value7 : V7,
 val value8 : V8,
 val value9 : V9,
 val value10 : V10,
 val value11 : V11,
 val value12 : V12,
 val value13 : V13,
 val value14 : V14,
 val value15 : V15,
 val value16 : V16,
 val value17 : V17,
 val value18 : V18,
 val value19 : V19,
 val value20 : V20)