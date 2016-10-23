/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class InnoSetupLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\";\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"FALSE\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"[code]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"pascal::MAIN\"}},{\"tag\":\"SEQ\",\"text\":\"[Setup]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Types]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Components]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Tasks]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Dirs]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Files]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Icons]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[INI]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[InstallDelete]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Languages]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Messages]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[CustomMessages]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[LangOptions]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Registry]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[Run]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[UninstallRun]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ\",\"text\":\"[UninstallDelete]\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#define\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#dim\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#undef\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#include\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#emit\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#expr\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#insert\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#append\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#if\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#elif\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#else\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#endif\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#ifexist\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#ifnexist\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#ifdef\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#for\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#sub\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#endsub\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#pragma\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#error\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DIRECTIVE\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL4\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{#\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"LITERAL2\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"STRING\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"STRING\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\";\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"Compression\"},{\"tag\":\"KEYWORD1\",\"text\":\"DiskClusterSize\"},{\"tag\":\"KEYWORD1\",\"text\":\"DiskSliceSize\"},{\"tag\":\"KEYWORD1\",\"text\":\"DiskSpanning\"},{\"tag\":\"KEYWORD1\",\"text\":\"Encryption\"},{\"tag\":\"KEYWORD1\",\"text\":\"InternalCompressLevel\"},{\"tag\":\"KEYWORD1\",\"text\":\"MergeDuplicateFiles\"},{\"tag\":\"KEYWORD1\",\"text\":\"OutputBaseFilename\"},{\"tag\":\"KEYWORD1\",\"text\":\"OutputDir\"},{\"tag\":\"KEYWORD1\",\"text\":\"ReserveBytes\"},{\"tag\":\"KEYWORD1\",\"text\":\"SlicesPerDisk\"},{\"tag\":\"KEYWORD1\",\"text\":\"SolidCompression\"},{\"tag\":\"KEYWORD1\",\"text\":\"SourceDir\"},{\"tag\":\"KEYWORD1\",\"text\":\"UseSetupLdr\"},{\"tag\":\"KEYWORD1\",\"text\":\"VersionInfoCompany\"},{\"tag\":\"KEYWORD1\",\"text\":\"VersionInfoDescription\"},{\"tag\":\"KEYWORD1\",\"text\":\"VersionInfoTextVersion\"},{\"tag\":\"KEYWORD1\",\"text\":\"VersionInfoVersion\"},{\"tag\":\"KEYWORD1\",\"text\":\"AllowCancelDuringInstall\"},{\"tag\":\"KEYWORD1\",\"text\":\"AllowNoIcons\"},{\"tag\":\"KEYWORD1\",\"text\":\"AllowRootDirectory\"},{\"tag\":\"KEYWORD1\",\"text\":\"AllowUNCPath\"},{\"tag\":\"KEYWORD1\",\"text\":\"AlwaysRestart\"},{\"tag\":\"KEYWORD1\",\"text\":\"AlwaysShowComponentsList\"},{\"tag\":\"KEYWORD1\",\"text\":\"AlwaysShowDirOnReadyPage\"},{\"tag\":\"KEYWORD1\",\"text\":\"AlwaysShowGroupOnReadyPage\"},{\"tag\":\"KEYWORD1\",\"text\":\"AlwaysUsePersonalGroup\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppendDefaultDirName\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppendDefaultGroupName\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppComments\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppContact\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppId\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppModifyPath\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppMutex\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppName\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppPublisher\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppPublisherURL\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppReadmeFile\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppSupportURL\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppUpdatesURL\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppVersion\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppVerName\"},{\"tag\":\"KEYWORD1\",\"text\":\"ChangesAssociations\"},{\"tag\":\"KEYWORD1\",\"text\":\"CreateAppDir\"},{\"tag\":\"KEYWORD1\",\"text\":\"CreateUninstallRegKey\"},{\"tag\":\"KEYWORD1\",\"text\":\"DefaultDirName\"},{\"tag\":\"KEYWORD1\",\"text\":\"DefaultGroupName\"},{\"tag\":\"KEYWORD1\",\"text\":\"DefaultUserInfoName\"},{\"tag\":\"KEYWORD1\",\"text\":\"DefaultUserInfoOrg\"},{\"tag\":\"KEYWORD1\",\"text\":\"DefaultUserInfoSerial\"},{\"tag\":\"KEYWORD1\",\"text\":\"DirExistsWarning\"},{\"tag\":\"KEYWORD1\",\"text\":\"DisableDirPage\"},{\"tag\":\"KEYWORD1\",\"text\":\"DisableFinishedPage\"},{\"tag\":\"KEYWORD1\",\"text\":\"DisableProgramGroupPage\"},{\"tag\":\"KEYWORD1\",\"text\":\"DisableReadyMemo\"},{\"tag\":\"KEYWORD1\",\"text\":\"DisableReadyPage\"},{\"tag\":\"KEYWORD1\",\"text\":\"DisableStartupPrompt\"},{\"tag\":\"KEYWORD1\",\"text\":\"EnableDirDoesntExistWarning\"},{\"tag\":\"KEYWORD1\",\"text\":\"ExtraDiskSpaceRequired\"},{\"tag\":\"KEYWORD1\",\"text\":\"InfoAfterFile\"},{\"tag\":\"KEYWORD1\",\"text\":\"InfoBeforeFile\"},{\"tag\":\"KEYWORD1\",\"text\":\"LanguageDetectionMethod\"},{\"tag\":\"KEYWORD1\",\"text\":\"LicenseFile\"},{\"tag\":\"KEYWORD1\",\"text\":\"MinVersion\"},{\"tag\":\"KEYWORD1\",\"text\":\"OnlyBelowVersion\"},{\"tag\":\"KEYWORD1\",\"text\":\"Password\"},{\"tag\":\"KEYWORD1\",\"text\":\"PrivilegesRequired\"},{\"tag\":\"KEYWORD1\",\"text\":\"RestartIfNeededByRun\"},{\"tag\":\"KEYWORD1\",\"text\":\"ShowLanguageDialog\"},{\"tag\":\"KEYWORD1\",\"text\":\"TimeStampRounding\"},{\"tag\":\"KEYWORD1\",\"text\":\"TimeStampsInUTC\"},{\"tag\":\"KEYWORD1\",\"text\":\"TouchDate\"},{\"tag\":\"KEYWORD1\",\"text\":\"TouchTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"Uninstallable\"},{\"tag\":\"KEYWORD1\",\"text\":\"UninstallDisplayIcon\"},{\"tag\":\"KEYWORD1\",\"text\":\"UninstallDisplayName\"},{\"tag\":\"KEYWORD1\",\"text\":\"UninstallFilesDir\"},{\"tag\":\"KEYWORD1\",\"text\":\"UninstallLogMode\"},{\"tag\":\"KEYWORD1\",\"text\":\"UninstallRestartComputer\"},{\"tag\":\"KEYWORD1\",\"text\":\"UpdateUninstallLogAppName\"},{\"tag\":\"KEYWORD1\",\"text\":\"UsePreviousAppDir\"},{\"tag\":\"KEYWORD1\",\"text\":\"UsePreviousGroup\"},{\"tag\":\"KEYWORD1\",\"text\":\"UsePreviousSetupType\"},{\"tag\":\"KEYWORD1\",\"text\":\"UsePreviousTasks\"},{\"tag\":\"KEYWORD1\",\"text\":\"UsePreviousUserInfo\"},{\"tag\":\"KEYWORD1\",\"text\":\"UserInfoPage\"},{\"tag\":\"KEYWORD1\",\"text\":\"AppCopyright\"},{\"tag\":\"KEYWORD1\",\"text\":\"BackColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"BackColor2\"},{\"tag\":\"KEYWORD1\",\"text\":\"BackColorDirection\"},{\"tag\":\"KEYWORD1\",\"text\":\"BackSolid\"},{\"tag\":\"KEYWORD1\",\"text\":\"FlatComponentsList\"},{\"tag\":\"KEYWORD1\",\"text\":\"SetupIconFile\"},{\"tag\":\"KEYWORD1\",\"text\":\"ShowComponentSizes\"},{\"tag\":\"KEYWORD1\",\"text\":\"ShowTasksTreeLines\"},{\"tag\":\"KEYWORD1\",\"text\":\"UninstallStyle\"},{\"tag\":\"KEYWORD1\",\"text\":\"WindowShowCaption\"},{\"tag\":\"KEYWORD1\",\"text\":\"WindowStartMaximized\"},{\"tag\":\"KEYWORD1\",\"text\":\"WindowResizable\"},{\"tag\":\"KEYWORD1\",\"text\":\"WindowVisible\"},{\"tag\":\"KEYWORD1\",\"text\":\"WizardImageBackColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"WizardImageFile\"},{\"tag\":\"KEYWORD1\",\"text\":\"WizardImageStretch\"},{\"tag\":\"KEYWORD1\",\"text\":\"WizardSmallImageBackColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"WizardSmallImageFile\"},{\"tag\":\"KEYWORD1\",\"text\":\"UninstallIconFile\"},{\"tag\":\"KEYWORD4\",\"text\":\"AfterInstall\"},{\"tag\":\"KEYWORD4\",\"text\":\"Attribs\"},{\"tag\":\"KEYWORD4\",\"text\":\"BeforeInstall\"},{\"tag\":\"KEYWORD4\",\"text\":\"Check\"},{\"tag\":\"KEYWORD4\",\"text\":\"Comment\"},{\"tag\":\"KEYWORD4\",\"text\":\"Components\"},{\"tag\":\"KEYWORD4\",\"text\":\"CopyMode\"},{\"tag\":\"KEYWORD4\",\"text\":\"Description\"},{\"tag\":\"KEYWORD4\",\"text\":\"DestDir\"},{\"tag\":\"KEYWORD4\",\"text\":\"DestName\"},{\"tag\":\"KEYWORD4\",\"text\":\"Excludes\"},{\"tag\":\"KEYWORD4\",\"text\":\"ExtraDiskSpaceRequired\"},{\"tag\":\"KEYWORD4\",\"text\":\"Filename\"},{\"tag\":\"KEYWORD4\",\"text\":\"Flags\"},{\"tag\":\"KEYWORD4\",\"text\":\"FontInstall\"},{\"tag\":\"KEYWORD4\",\"text\":\"GroupDescription\"},{\"tag\":\"KEYWORD4\",\"text\":\"HotKey\"},{\"tag\":\"KEYWORD4\",\"text\":\"IconFilename\"},{\"tag\":\"KEYWORD4\",\"text\":\"IconIndex\"},{\"tag\":\"KEYWORD4\",\"text\":\"InfoBeforeFile\"},{\"tag\":\"KEYWORD4\",\"text\":\"InfoAfterFile\"},{\"tag\":\"KEYWORD4\",\"text\":\"Key\"},{\"tag\":\"KEYWORD4\",\"text\":\"MessagesFile\"},{\"tag\":\"KEYWORD4\",\"text\":\"Name\"},{\"tag\":\"KEYWORD4\",\"text\":\"Parameters\"},{\"tag\":\"KEYWORD4\",\"text\":\"Permissions\"},{\"tag\":\"KEYWORD4\",\"text\":\"Root\"},{\"tag\":\"KEYWORD4\",\"text\":\"RunOnceId\"},{\"tag\":\"KEYWORD4\",\"text\":\"Section\"},{\"tag\":\"KEYWORD4\",\"text\":\"Source\"},{\"tag\":\"KEYWORD4\",\"text\":\"StatusMsg\"},{\"tag\":\"KEYWORD4\",\"text\":\"String\"},{\"tag\":\"KEYWORD4\",\"text\":\"Subkey\"},{\"tag\":\"KEYWORD4\",\"text\":\"Tasks\"},{\"tag\":\"KEYWORD4\",\"text\":\"Type\"},{\"tag\":\"KEYWORD4\",\"text\":\"Types\"},{\"tag\":\"KEYWORD4\",\"text\":\"ValueType\"},{\"tag\":\"KEYWORD4\",\"text\":\"ValueName\"},{\"tag\":\"KEYWORD4\",\"text\":\"ValueData\"},{\"tag\":\"KEYWORD4\",\"text\":\"WorkingDir\"},{\"tag\":\"LITERAL3\",\"text\":\"allowunsafefiles\"},{\"tag\":\"LITERAL3\",\"text\":\"checkedonce\"},{\"tag\":\"LITERAL3\",\"text\":\"closeonexit\"},{\"tag\":\"LITERAL3\",\"text\":\"compact\"},{\"tag\":\"LITERAL3\",\"text\":\"comparetimestamp\"},{\"tag\":\"LITERAL3\",\"text\":\"confirmoverwrite\"},{\"tag\":\"LITERAL3\",\"text\":\"createkeyifdoesntexist\"},{\"tag\":\"LITERAL3\",\"text\":\"createonlyiffileexists\"},{\"tag\":\"LITERAL3\",\"text\":\"createvalueifdoesntexist\"},{\"tag\":\"LITERAL3\",\"text\":\"deleteafterinstall\"},{\"tag\":\"LITERAL3\",\"text\":\"deletekey\"},{\"tag\":\"LITERAL3\",\"text\":\"deletevalue\"},{\"tag\":\"LITERAL3\",\"text\":\"desktopicon\"},{\"tag\":\"LITERAL3\",\"text\":\"dirifempty\"},{\"tag\":\"LITERAL3\",\"text\":\"disablenouninstallwarning\"},{\"tag\":\"LITERAL3\",\"text\":\"dontcloseonexit\"},{\"tag\":\"LITERAL3\",\"text\":\"dontcopy\"},{\"tag\":\"LITERAL3\",\"text\":\"dontcreatekey\"},{\"tag\":\"LITERAL3\",\"text\":\"dontinheritcheck\"},{\"tag\":\"LITERAL3\",\"text\":\"dontverifychecksum\"},{\"tag\":\"LITERAL3\",\"text\":\"exclusive\"},{\"tag\":\"LITERAL3\",\"text\":\"external\"},{\"tag\":\"LITERAL3\",\"text\":\"files\"},{\"tag\":\"LITERAL3\",\"text\":\"filesandordirs\"},{\"tag\":\"LITERAL3\",\"text\":\"fixed\"},{\"tag\":\"LITERAL3\",\"text\":\"fontisnttruetype\"},{\"tag\":\"LITERAL3\",\"text\":\"full\"},{\"tag\":\"LITERAL3\",\"text\":\"ignoreversion\"},{\"tag\":\"LITERAL3\",\"text\":\"iscustom\"},{\"tag\":\"LITERAL3\",\"text\":\"isreadme\"},{\"tag\":\"LITERAL3\",\"text\":\"hidden\"},{\"tag\":\"LITERAL3\",\"text\":\"hidewizard\"},{\"tag\":\"LITERAL3\",\"text\":\"modify\"},{\"tag\":\"LITERAL3\",\"text\":\"nocompression\"},{\"tag\":\"LITERAL3\",\"text\":\"noencryption\"},{\"tag\":\"LITERAL3\",\"text\":\"noerror\"},{\"tag\":\"LITERAL3\",\"text\":\"noregerror\"},{\"tag\":\"LITERAL3\",\"text\":\"nowait\"},{\"tag\":\"LITERAL3\",\"text\":\"onlyifdestfileexists\"},{\"tag\":\"LITERAL3\",\"text\":\"onlyifdoesntexist\"},{\"tag\":\"LITERAL3\",\"text\":\"overwritereadonly\"},{\"tag\":\"LITERAL3\",\"text\":\"postinstall\"},{\"tag\":\"LITERAL3\",\"text\":\"preservestringtype\"},{\"tag\":\"LITERAL3\",\"text\":\"promptifolder\"},{\"tag\":\"LITERAL3\",\"text\":\"quicklaunchicon\"},{\"tag\":\"LITERAL3\",\"text\":\"read\"},{\"tag\":\"LITERAL3\",\"text\":\"readonly\"},{\"tag\":\"LITERAL3\",\"text\":\"readexec\"},{\"tag\":\"LITERAL3\",\"text\":\"recursesubdirs\"},{\"tag\":\"LITERAL3\",\"text\":\"regserver\"},{\"tag\":\"LITERAL3\",\"text\":\"regtypelib\"},{\"tag\":\"LITERAL3\",\"text\":\"replacesameversion\"},{\"tag\":\"LITERAL3\",\"text\":\"restart\"},{\"tag\":\"LITERAL3\",\"text\":\"restartreplace\"},{\"tag\":\"LITERAL3\",\"text\":\"runhidden\"},{\"tag\":\"LITERAL3\",\"text\":\"runmaximized\"},{\"tag\":\"LITERAL3\",\"text\":\"runminimized\"},{\"tag\":\"LITERAL3\",\"text\":\"sharedfile\"},{\"tag\":\"LITERAL3\",\"text\":\"shellexec\"},{\"tag\":\"LITERAL3\",\"text\":\"skipifnotsilent\"},{\"tag\":\"LITERAL3\",\"text\":\"skipifsilent\"},{\"tag\":\"LITERAL3\",\"text\":\"skipifdoesntexist\"},{\"tag\":\"LITERAL3\",\"text\":\"skipifsourcedoesntexist\"},{\"tag\":\"LITERAL3\",\"text\":\"sortfilesbyextension\"},{\"tag\":\"LITERAL3\",\"text\":\"system\"},{\"tag\":\"LITERAL3\",\"text\":\"touch\"},{\"tag\":\"LITERAL3\",\"text\":\"unchecked\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsalwaysuninstall\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsclearvalue\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsdeleteentry\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsdeletekey\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsdeletekeyifempty\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsdeletesection\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsdeletesectionifempty\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsdeletevalue\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsneveruninstall\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsremovereadonly\"},{\"tag\":\"LITERAL3\",\"text\":\"uninsrestartdelete\"},{\"tag\":\"LITERAL3\",\"text\":\"useapppaths\"},{\"tag\":\"LITERAL3\",\"text\":\"waituntilidle\"},{\"tag\":\"LITERAL3\",\"text\":\"HKCR\"},{\"tag\":\"LITERAL3\",\"text\":\"HKCU\"},{\"tag\":\"LITERAL3\",\"text\":\"HKLM\"},{\"tag\":\"LITERAL3\",\"text\":\"HKU\"},{\"tag\":\"LITERAL3\",\"text\":\"HKCC\"},{\"tag\":\"LITERAL3\",\"text\":\"none\"},{\"tag\":\"LITERAL3\",\"text\":\"string\"},{\"tag\":\"LITERAL3\",\"text\":\"expandsz\"},{\"tag\":\"LITERAL3\",\"text\":\"multisz\"},{\"tag\":\"LITERAL3\",\"text\":\"dword\"},{\"tag\":\"LITERAL3\",\"text\":\"binary\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"STRING\",\"DEFAULT\":\"LITERAL1\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL4\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{#\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD3\",\"DELEGATE\":\"CONSTANT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{\"},{\"tag\":\"END\",\"text\":\"}\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"CONSTANT\",\"DEFAULT\":\"KEYWORD3\"},\"child\":[{\"tag\":\"MARK_FOLLOWING\",\"text\":\"code:\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"CONTEXT\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DIRECTIVE\",\"DEFAULT\":\"LITERAL4\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\";\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"FUNCTION\",\"text\":\"Defined\"},{\"tag\":\"FUNCTION\",\"text\":\"TypeOf\"},{\"tag\":\"FUNCTION\",\"text\":\"GetFileVersion\"},{\"tag\":\"FUNCTION\",\"text\":\"GetStringFileInfo\"},{\"tag\":\"FUNCTION\",\"text\":\"Int\"},{\"tag\":\"FUNCTION\",\"text\":\"Str\"},{\"tag\":\"FUNCTION\",\"text\":\"FileExists\"},{\"tag\":\"FUNCTION\",\"text\":\"FileSize\"},{\"tag\":\"FUNCTION\",\"text\":\"ReadIni\"},{\"tag\":\"FUNCTION\",\"text\":\"WriteIni\"},{\"tag\":\"FUNCTION\",\"text\":\"ReadReg\"},{\"tag\":\"FUNCTION\",\"text\":\"Exec\"},{\"tag\":\"FUNCTION\",\"text\":\"Copy\"},{\"tag\":\"FUNCTION\",\"text\":\"Pos\"},{\"tag\":\"FUNCTION\",\"text\":\"RPos\"},{\"tag\":\"FUNCTION\",\"text\":\"Len\"},{\"tag\":\"FUNCTION\",\"text\":\"SaveToFile\"},{\"tag\":\"FUNCTION\",\"text\":\"Find\"},{\"tag\":\"FUNCTION\",\"text\":\"SetupSetting\"},{\"tag\":\"FUNCTION\",\"text\":\"SetSetupSetting\"},{\"tag\":\"FUNCTION\",\"text\":\"LowerCase\"},{\"tag\":\"FUNCTION\",\"text\":\"EntryCount\"},{\"tag\":\"FUNCTION\",\"text\":\"GetEnv\"},{\"tag\":\"FUNCTION\",\"text\":\"DeleteFile\"},{\"tag\":\"FUNCTION\",\"text\":\"CopyFile\"},{\"tag\":\"FUNCTION\",\"text\":\"FindFirst\"},{\"tag\":\"FUNCTION\",\"text\":\"FindNext\"},{\"tag\":\"FUNCTION\",\"text\":\"FindClose\"},{\"tag\":\"FUNCTION\",\"text\":\"FindGetFileName\"},{\"tag\":\"FUNCTION\",\"text\":\"FileOpen\"},{\"tag\":\"FUNCTION\",\"text\":\"FileRead\"},{\"tag\":\"FUNCTION\",\"text\":\"FileReset\"},{\"tag\":\"FUNCTION\",\"text\":\"FileEof\"},{\"tag\":\"FUNCTION\",\"text\":\"FileClose\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}