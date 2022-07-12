node {  
    stage('git clone') { 
        git 'https://github.com/swapnibrad/shubham_b.git'
    }
    stage('Build_vaibhav') { 
        sh 'pwd >> home.txt' 
    }
    stage('Deploy') { 
        echo 'pipeline succeccfully deployed' >> home.txt 
    }
}
