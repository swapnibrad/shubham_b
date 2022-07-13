job('test') {
    steps {
        shell('echo Hello World!')
    }
    steps {
        shell('pwd' >> file.txt)
    }
}
