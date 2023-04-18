.class public final Lio/sentry/n4;
.super Lio/sentry/c4;
.source "SourceFile"


# instance fields
.field private final t:Ljava/lang/String;

.field private final u:Lio/sentry/protocol/y;

.field private v:Lio/sentry/m4;

.field private w:Lio/sentry/c;

.field private x:Lio/sentry/p0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/sentry/protocol/y;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lio/sentry/n4;-><init>(Ljava/lang/String;Lio/sentry/protocol/y;Ljava/lang/String;Lio/sentry/m4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/sentry/protocol/y;Ljava/lang/String;Lio/sentry/m4;)V
    .locals 0

    .line 4
    invoke-direct {p0, p3}, Lio/sentry/c4;-><init>(Ljava/lang/String;)V

    .line 5
    sget-object p3, Lio/sentry/p0;->SENTRY:Lio/sentry/p0;

    iput-object p3, p0, Lio/sentry/n4;->x:Lio/sentry/p0;

    const-string p3, "name is required"

    .line 6
    invoke-static {p1, p3}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lio/sentry/n4;->t:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lio/sentry/n4;->u:Lio/sentry/protocol/y;

    .line 8
    invoke-virtual {p0, p4}, Lio/sentry/c4;->l(Lio/sentry/m4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/n4;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/sentry/m4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/sentry/m4;)V
    .locals 1

    .line 3
    sget-object v0, Lio/sentry/protocol/y;->CUSTOM:Lio/sentry/protocol/y;

    invoke-direct {p0, p1, v0, p2, p3}, Lio/sentry/n4;-><init>(Ljava/lang/String;Lio/sentry/protocol/y;Ljava/lang/String;Lio/sentry/m4;)V

    return-void
.end method


# virtual methods
.method public o()Lio/sentry/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/n4;->w:Lio/sentry/c;

    return-object v0
.end method

.method public p()Lio/sentry/p0;
    .locals 1

    iget-object v0, p0, Lio/sentry/n4;->x:Lio/sentry/p0;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/n4;->t:Ljava/lang/String;

    return-object v0
.end method

.method public r()Lio/sentry/m4;
    .locals 1

    iget-object v0, p0, Lio/sentry/n4;->v:Lio/sentry/m4;

    return-object v0
.end method

.method public s()Lio/sentry/protocol/y;
    .locals 1

    iget-object v0, p0, Lio/sentry/n4;->u:Lio/sentry/protocol/y;

    return-object v0
.end method
