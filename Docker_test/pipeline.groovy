pipeline {
    agent any

    stages {
        stage('Git Pull') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/nomnomtastynom/CITC.git']]])
            }
        }
        
        stage('Version1') {
            steps {
                dir('Software 1') {
                       // some block
                     bat "Software1_2.py"
                  }
            }
        }
        
           stage('Version2') {
            steps {
                dir('Software 2 Versions') {
                       // some block
                     bat "Software2_1.py"
                  }
            }
        }
        
           
           stage('Version3') {
            steps {
                dir('Software 3 Versions') {
                       // some block
                     bat "Software3_1.py"
                  }
            }
        }
        
        
         
           stage('Version4') {
            steps {
                dir('Software 4 Versions') {
                       // some block
                     bat "Software4_1.py"
                  }
            }
        }
        
        
         
           stage('Version5') {
            steps {
                dir('Software 5 Versions') {
                       // some block
                     bat "Software5_1.py"
                      
                      
                  }
            }
        }
        
        
    }
}
