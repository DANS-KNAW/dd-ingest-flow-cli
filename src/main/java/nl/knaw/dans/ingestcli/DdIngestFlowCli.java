/*
 * Copyright (C) 2024 DANS - Data Archiving and Networked Services (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.knaw.dans.ingestcli;

import lombok.extern.slf4j.Slf4j;
import nl.knaw.dans.ingestcli.config.DdIngestFlowCliConfig;
import nl.knaw.dans.lib.util.AbstractCommandLineApp;
import nl.knaw.dans.lib.util.PicocliVersionProvider;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "ingest-flow",
         mixinStandardHelpOptions = true,
         versionProvider = PicocliVersionProvider.class,
         description = "Command-line client for DD Ingest Flow")
@Slf4j
public class DdIngestFlowCli extends AbstractCommandLineApp<DdIngestFlowCliConfig> {
    public static void main(String[] args) throws Exception {
        new DdIngestFlowCli().run(args);
    }

    public String getName() {
        return "Command-line client for DD Ingest Flow";
    }

    @Override
    public void configureCommandLine(CommandLine commandLine, DdIngestFlowCliConfig config) {
        // TODO: set up the API client, if applicable
        log.debug("Configuring command line");
        // TODO: add options and subcommands
    }
}
