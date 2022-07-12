a = "rupam_nagpur"
node {  
    stage('git clone') { 
        git 'https://github.com/swapnibrad/shubham_b.git'
    }
    stage('Build_vaibhav') { 
        sh 'pwd >> home.txt' 
    }
    stage('test') { 
        sh 'echo \'successfully deployed\' >> home.txt' 
    }
    stage('Deploy') { 
        sh 'echo $a' 
    }
}
