# Google AI Platform Client for Java

Java idiomatic client for [AI Platform][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]

> Note: This client is a work-in-progress, and may occasionally
> make backwards-incompatible changes.

## Quickstart

If you are using Maven with [BOM][libraries-bom], add this to your pom.xml file
```xml
  <dependencies>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>google-cloud-aiplatform</artifactId>
      <version>0.0.1-SNAPSHOT</version>
    </dependency>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>google-cloud-storage</artifactId>
      <version>1.113.2</version>
    </dependency>
    <dependency>
      <groupId>com.google.protobuf</groupId>
      <artifactId>protobuf-java-util</artifactId>
      <version>4.0.0-rc-1</version>
    </dependency>


    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>com.google.truth</groupId>
      <artifactId>truth</artifactId>
      <version>1.1</version>
      <scope>test</scope>
    </dependency>

  </dependencies>
</project>

```

If you are using Maven without BOM, add this to your dependencies:

```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-aiplatform</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>

```

If you are using Gradle, add this to your dependencies
```Groovy
compile 'com.google.cloud:google-cloud-aiplatform:0.0.0'
```
If you are using SBT, add this to your dependencies
```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-aiplatform" % "0.0.0"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the AI Platform [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google AI Platform.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-aiplatform` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-aiplatform` as a dependency in your code.

## About AI Platform


[AI Platform][product-docs] brings AutoML and AI Platform (Legacy) together into a unified API, client library, and user interface.

See the [AI Platform client library docs][javadocs] to learn how to
use this AI Platform Client Library.





## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-aiplatform/tree/master/samples) directory. The samples' `README.md`
has instructions for running the samples.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| Cancel Data Labeling Job Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CancelDataLabelingJobSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CancelDataLabelingJobSample.java) |
| Cancel Training Pipeline Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CancelTrainingPipelineSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CancelTrainingPipelineSample.java) |
| Create Data Labeling Job Image Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateDataLabelingJobImageSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateDataLabelingJobImageSample.java) |
| Create Data Labeling Job Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateDataLabelingJobSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateDataLabelingJobSample.java) |
| Create Data Labeling Job Video Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateDataLabelingJobVideoSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateDataLabelingJobVideoSample.java) |
| Create Dataset Tabular Bigquery Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateDatasetTabularBigquerySample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateDatasetTabularBigquerySample.java) |
| Create Dataset Tabular Gcs Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateDatasetTabularGcsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateDatasetTabularGcsSample.java) |
| Create Training Pipeline Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateTrainingPipelineSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateTrainingPipelineSample.java) |
| Create Training Pipeline Tabular Classification Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateTrainingPipelineTabularClassificationSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateTrainingPipelineTabularClassificationSample.java) |
| Create Training Pipeline Tabular Regression Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/CreateTrainingPipelineTabularRegressionSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/CreateTrainingPipelineTabularRegressionSample.java) |
| Delete Data Labeling Job Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/DeleteDataLabelingJobSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/DeleteDataLabelingJobSample.java) |
| Delete Dataset Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/DeleteDatasetSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/DeleteDatasetSample.java) |
| Delete Export Model Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/DeleteExportModelSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/DeleteExportModelSample.java) |
| Delete Model Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/DeleteModelSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/DeleteModelSample.java) |
| Delete Training Pipeline Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/DeleteTrainingPipelineSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/DeleteTrainingPipelineSample.java) |
| Export Model Tabular Classification Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/ExportModelTabularClassificationSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/ExportModelTabularClassificationSample.java) |
| Get Model Evaluation Tabular Classification Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/GetModelEvaluationTabularClassificationSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/GetModelEvaluationTabularClassificationSample.java) |
| Get Model Evaluation Tabular Regression Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/GetModelEvaluationTabularRegressionSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/GetModelEvaluationTabularRegressionSample.java) |
| Get Training Pipeline Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/GetTrainingPipelineSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/GetTrainingPipelineSample.java) |
| Predict Custom Trained Model Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/PredictCustomTrainedModelSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/PredictCustomTrainedModelSample.java) |
| Predict Tabular Classification Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/PredictTabularClassificationSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/PredictTabularClassificationSample.java) |
| Predict Tabular Regression Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/PredictTabularRegressionSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/PredictTabularRegressionSample.java) |
| Upload Model Sample | [source code](https://github.com/googleapis/java-aiplatform/blob/master/samples/snippets/src/main/java/aiplatform/UploadModelSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-aiplatform&page=editor&open_in_editor=samples/snippets/src/main/java/aiplatform/UploadModelSample.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

AI Platform uses gRPC for the transport layer.

## Java Versions

Java 7 or above is required for using this client.

## Versioning


This library follows [Semantic Versioning](http://semver.org/).


It is currently in major version zero (``0.y.z``), which means that anything may change at any time
and the public API should not be considered stable.

## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.

## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 7 | [![Kokoro CI][kokoro-badge-image-1]][kokoro-badge-link-1]
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

[product-docs]: https://cloud.google.com/ai-platform-unified/docs
[javadocs]: https://googleapis.dev/java/google-cloud-aiplatform/latest/index.html
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-aiplatform/java11.html
[stability-image]: https://img.shields.io/badge/stability-beta-yellow
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-aiplatform.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.cloud%20AND%20a:google-cloud-aiplatform&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/master/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-aiplatform/blob/master/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-aiplatform/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-aiplatform/blob/master/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=aiplatform.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png
