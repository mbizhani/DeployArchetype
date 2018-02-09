# DeployArchetype

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.devocative/deploy-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.devocative/deploy-archetype)

A Maven archetype to create project for deploying `Demeter` &amp; other DModules through a `WAR`
```shell
mvn -B archetype:generate \
	-DarchetypeGroupId=org.devocative \
	-DarchetypeArtifactId=deploy-archetype \
	-DarchetypeVersion=1.0 \
	-DgroupId=? \
	-DartifactId=? \
	-Dversion=1.0 \
	-Dpackage=? \
	-DDeploymentTarget=?
```

This is the command for [Store example](https://github.com/mbizhani/Demeter):
```shell
mvn -B archetype:generate \
	-DarchetypeGroupId=org.devocative \
	-DarchetypeArtifactId=deploy-archetype \
	-DarchetypeVersion=1.0 \
	-DgroupId=my.pkg \
	-DartifactId=store-dpl \
	-Dversion=1.0 \
	-Dpackage=my.pkg.store \
	-DDeploymentTarget=Store
```