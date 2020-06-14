package com.github.lucasls.jooqkotlin

import org.jooq.DSLContext
import org.jooq.impl.DSL

abstract class TestBase {
    val dslContext: DSLContext = DSL.using("jdbc:h2:mem:;init=runscript from 'classpath:init.sql'")
}