def call() {

    library(
        identifier: "child@master",
        retriever: modernSCM(
            github(credentialsId: env.SECRET_ID, repoOwner: 'skinitimski', repository: 'library.child')
        )
    )

    stepFromChild()
    stepFromChild()
}
