node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/procpsport.git'), string(name: 'PORT_DESCRIPTION', value: 'Several process utilities' )]
  }
}