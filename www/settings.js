/*global cordova, module*/

module.exports = {
    isUnknowSourcesEnabled: function (name,successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Settings", "getSetting");
    }
};
