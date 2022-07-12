node {  
    stage('git clone') { 
        git 'https://github.com/swapnibrad/shubham_b.git'
    }
    stage('Build_vaibhav') { 
        sh 'pwd >> home.txt' 
    }
    stage('Deploy') { 
        sh 'echo \'successfully deployed\' >> home.txt' 
    }
}
