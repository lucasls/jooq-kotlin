package com.github.lucasls.jooqkotlin

import org.jooq.Condition
import org.jooq.Field

// TODO add Javadoc and tests

infix fun Field<String>.equalIgnoreCase(value: String): Condition = this.equalIgnoreCase(value)
infix fun Field<String>.equalIgnoreCase(value: Field<String>): Condition = this.equalIgnoreCase(value)

fun Field<String>.equal(value: String, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) equalIgnoreCase(value) else equal(value)

fun Field<String>.equal(value: Field<String>, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) equalIgnoreCase(value) else equal(value)

fun Field<String>.eq(value: String, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) equalIgnoreCase(value) else equal(value)

fun Field<String>.eq(value: Field<String>, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) equalIgnoreCase(value) else equal(value)

fun Field<String>.notEqual(value: String, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) notEqualIgnoreCase(value) else notEqual(value)

fun Field<String>.notEqual(value: Field<String>, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) notEqualIgnoreCase(value) else notEqual(value)

fun Field<String>.ne(value: String, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) notEqualIgnoreCase(value) else notEqual(value)

fun Field<String>.ne(value: Field<String>, ignoreCase: Boolean = false): Condition =
    if (ignoreCase) notEqualIgnoreCase(value) else notEqual(value)