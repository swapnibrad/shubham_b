a = swapnil
node {  
    stage('Build') { 
        git 'https://github.com/swapnibrad/shubham_b.git' 
    }
    stage('Test') { 
        echo 'successfully deployed build stage' 
    }
    stage('Deploy') { 
        sh 'echo $a' 
    }
}
