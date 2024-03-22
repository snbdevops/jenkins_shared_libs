def call(Map StageParams){

    checkout([
        $class: 'GitSCM'
        branches: [[name: StageParams.branch ]],
        userRemoteConfigs: [[url: StageParams.url ]]
    ])
}