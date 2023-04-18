.class abstract Loa/i;
.super Loa/g;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Loa/g;-><init>()V

    const-string p1, "CharMatcher.none()"

    iput-object p1, p0, Loa/i;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loa/i;->a:Ljava/lang/String;

    return-object v0
.end method
