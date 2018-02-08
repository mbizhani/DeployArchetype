# DeployArchetype
A Maven archetype to create project for deploying Demeter &amp; DModules

mvn -B archetype:generate -DarchetypeGroupId=org.devocative -DarchetypeArtifactId=deploy-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=my.pkg -DartifactId=store-dpl -Dpackage=my.pkg.store -DDeploymentTarget=Store -Dversion=1.0