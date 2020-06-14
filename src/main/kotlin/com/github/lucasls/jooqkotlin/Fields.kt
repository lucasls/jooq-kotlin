package com.github.lucasls.jooqkotlin

import org.jooq.Condition
import org.jooq.Field
import org.jooq.QuantifiedSelect
import org.jooq.Record1
import org.jooq.Result
import org.jooq.Select

// TODO add Javadoc and tests

infix fun <T> Field<T>.eq(value: T): Condition = eq(value)
infix fun <T> Field<T>.eq(value: Field<T>): Condition = eq(value)
infix fun <T> Field<T>.eq(query: Select<out Record1<T>>): Condition = eq(query)
infix fun <T> Field<T>.eq(query: QuantifiedSelect<out Record1<T>>): Condition = eq(query)

infix fun <T> Field<T>.greaterThan(value: T): Condition = greaterThan(value)
infix fun <T> Field<T>.greaterThan(value: Field<T>): Condition = greaterThan(value)
infix fun <T> Field<T>.greaterThan(query: Select<out Record1<T>>): Condition = greaterThan(query)
infix fun <T> Field<T>.greaterThan(query: QuantifiedSelect<out Record1<T>>): Condition = greaterThan(query)

infix fun <T> Field<T>.gt(value: T): Condition = gt(value)
infix fun <T> Field<T>.gt(value: Field<T>): Condition = gt(value)
infix fun <T> Field<T>.gt(query: Select<out Record1<T>>): Condition = gt(query)
infix fun <T> Field<T>.gt(query: QuantifiedSelect<out Record1<T>>): Condition = gt(query)

infix fun <T> Field<T>.lessThan(value: T): Condition = lessThan(value)
infix fun <T> Field<T>.lessThan(value: Field<T>): Condition = lessThan(value)
infix fun <T> Field<T>.lessThan(query: Select<out Record1<T>>): Condition = lessThan(query)
infix fun <T> Field<T>.lessThan(query: QuantifiedSelect<out Record1<T>>): Condition = lessThan(query)

infix fun <T> Field<T>.lt(value: T): Condition = lt(value)
infix fun <T> Field<T>.lt(value: Field<T>): Condition = lt(value)
infix fun <T> Field<T>.lt(query: Select<out Record1<T>>): Condition = lt(query)
infix fun <T> Field<T>.lt(query: QuantifiedSelect<out Record1<T>>): Condition = lt(query)

infix fun <T> Field<T>.isIn(value: Collection<T>): Condition = `in`(value)
infix fun <T> Field<T>.isIn(result: Result<out Record1<T>>): Condition = `in`(result)
fun <T> Field<T>.isIn(vararg values: T): Condition = `in`(*values)
fun <T> Field<T>.isIn(vararg values: Field<*>): Condition = `in`(*values)
infix fun <T> Field<T>.isIn(query: Select<out Record1<T>>): Condition = `in`(query)

infix fun <T> Field<T>.notEqual(value: T): Condition = notEqual(value)
infix fun <T> Field<T>.notEqual(value: Field<T>): Condition = notEqual(value)
infix fun <T> Field<T>.notEqual(query: Select<out Record1<T>>): Condition = notEqual(query)

infix fun <T> Field<T>.ne(value: T): Condition = ne(value)
infix fun <T> Field<T>.ne(value: Field<T>): Condition = ne(value)
infix fun <T> Field<T>.ne(query: Select<out Record1<T>>): Condition = ne(query)