package com.github.lucasls.jooqkotlin

import com.github.lucasls.jooqkotlin.codegen.tables.Beatle.BEATLE
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.containsExactly
import strikt.assertions.map

internal class ConditionsTest : TestBase() {

    @Test
    internal fun `should compare correctly 'condition and condition'`() {
        val b = BEATLE

        val result = dslContext.selectFrom(b)
            .where(b.INSTRUMENT.eq("guitar") and b.NAME.startsWith("j"))
            .fetch()

        expectThat(result)
            .map { it.name }
            .containsExactly("john")
    }

    @Test
    internal fun `should compare correctly 'condition and boolean field'`() {
        val b = BEATLE

        val result = dslContext.selectFrom(b)
            .where(b.INSTRUMENT.eq("guitar") and b.LEAD_VOCALS)
            .fetch()

        expectThat(result)
            .map { it.name }
            .containsExactly("john")
    }

    @Test
    internal fun `should compare correctly 'condition or condition'`() {
        val b = BEATLE

        val result = dslContext.selectFrom(b)
            .where(b.INSTRUMENT.eq("bass") or b.NAME.startsWith("j"))
            .fetch()

        expectThat(result)
            .map { it.name }
            .containsExactly("john", "paul")
    }

    @Test
    internal fun `should compare correctly 'condition or boolean field'`() {
        val b = BEATLE

        val result = dslContext.selectFrom(b)
            .where(b.INSTRUMENT.eq("guitar") or b.LEAD_VOCALS)
            .fetch()

        expectThat(result)
            .map { it.name }
            .containsExactly("john", "paul", "george")
    }
}