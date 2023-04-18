.class public Lle/a;
.super Lle/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lle/a;-><init>(Lje/d;)V

    return-void
.end method

.method public constructor <init>(Lje/d;)V
    .locals 3

    const-string v0, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}"

    const/4 v1, 0x0

    const-string v2, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main()\n{\ngl_Position = uMVPMatrix * aPosition;\nvTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}"

    .line 2
    invoke-direct {p0, v2, v0, v1, p1}, Lle/b;-><init>(Ljava/lang/String;Ljava/lang/String;[Lme/a;Lje/d;)V

    return-void
.end method
