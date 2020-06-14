package com.github.lucasls.jooqkotlin

import org.jooq.Condition
import org.jooq.Field

/**
 * Infix extension of [Condition.and]
 * @see Condition.and
 */
infix fun Condition.and(other: Condition): Condition = and(other)

/**
 * Infix extension of [Condition.and]
 * @see Condition.and
 */
infix fun Condition.and(other: Field<Boolean>): Condition = and(other)

/**
 * Infix extension of [Condition.or]
 * @see Condition.or
 */
infix fun Condition.or(other: Condition): Condition = or(other)

/**
 * Infix extension of [Condition.or]
 * @see Condition.or
 */
infix fun Condition.or(other: Field<Boolean>): Condition = or(other)