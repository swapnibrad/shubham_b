// job('test') {
//     steps {
//         shell('echo Hello World!')
//     }
//     steps {
//         shell('echo good morning')
//     }
// }

job('job_1') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/swapnibrad/shubham_b.git')
            }
        }
    }
    steps {
         shell('echo successfully implemented item')
    }
}