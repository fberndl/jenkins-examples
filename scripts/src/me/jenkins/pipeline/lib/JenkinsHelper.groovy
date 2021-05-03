package me.jenkins.pipeline.lib

class JenkinsHelper implements Serializable {
  def env
  def steps
  def gitCredentialsId
  def gitBuildEnv
  JenkinsHelper(env, steps) {
    this.env = env
    this.steps = steps
  }
  /*
  * @param getBranchName
  */
  def getBranchName(String jobName) {
    def splittedJobName = jobName.split("/") as List
    return splittedJobName.last().replace("%2F", "/")
  }

}