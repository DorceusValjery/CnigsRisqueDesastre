<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Données historiques <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><g:link controller="accident"> Accident Routier</g:link></li>
                <li><g:link controller="glissement">Glissement de Terrain</g:link></li>
                <li><g:link controller="incendie">Incendie</g:link></li>
                <li><g:link controller="inondation">Inondation</g:link></li>
                <li><g:link controller="seisme">Tremblements de terre</g:link></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Partenaires GRD <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Comité Local de Protection Civile</a></li>
                <li><a href="#">Comité Communal de Protection Civile</a></li>
                <li><a href="#">Comité Départemental de Protection Civile</a></li>
                <li><a href="#">Comité Central de Protection Civile</a></li>
            </ul>
        </li>
        %{--<li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                    <li><a href="#">${plugin.name} - ${plugin.version}</a></li>
                </g:each>
            </ul>
        </li>--}%
    </content>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="haiti-banner.png" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Bienvenue sur la plateforme GRD d'Haïti</h1>

            <p>
                Congratulations, you have successfully started your first Grails application! At the moment
                this is the default page, feel free to modify it to either redirect to a controller or display
                whatever content you may choose. Below is a list of controllers that are currently deployed in
                this application, click on each to execute its default action:
            </p>

            %{--<div id="controllers" role="navigation">
                <h2>Available Controllers:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>--}%
        </section>
    </div>

</body>
</html>
