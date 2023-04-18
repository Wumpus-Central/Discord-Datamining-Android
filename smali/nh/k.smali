.class public Lnh/k;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field private k:Lnh/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lnh/k;->k:Lnh/q;

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static b()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static c()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static d()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static e()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static f()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static g()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static h()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static j()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static k()Lnh/k;
    .locals 2

    new-instance v0, Lnh/k;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lnh/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Lnh/q;
    .locals 1

    iget-object v0, p0, Lnh/k;->k:Lnh/q;

    return-object v0
.end method

.method public i(Lnh/q;)Lnh/k;
    .locals 0

    iput-object p1, p0, Lnh/k;->k:Lnh/q;

    return-object p0
.end method
