package spring

import schwartztest.TestJob

// Place your Spring DSL code here
beans = {
    'testJob'(TestJob) { bean ->
        bean.scope = 'prototype'
    }
}
