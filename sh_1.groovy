job('test') {
    steps {
        shell('echo Hello World!')
    }
    steps {
        shell('echo good morning')
    }
}
